# UIWear AOSP frameworks/base

***Caution:*** only tested on Nexus 5 (hammerhead)

## Basic workflow

1. Configure Android build environment
    see https://source.android.com/source/initializing.html
2. Prepare binary files
    - Download the binaries from:
    https://developers.google.com/android/nexus/drivers#hammerheadmob30y
    - Unzip binary zip files and put them into source root dir, then run those shell scripts to extract them

3. Sync source code
    - `cd your_working_dir`
    - `repo init -u https://android.googlesource.com/platform/manifest -b android-6.0.1_r60`
    - `git clone https://github.com/SBUNetSys/local_manifests.git > .repo/local_manifests`
    (If local_manifests directory already exists, just put [uiwear_aosp_hammerhead.xml](https://raw.githubusercontent.com/SBUNetSys/local_manifests/master/uiwear_aosp_hammerhead.xml) into it)
    - `repo sync` or ues `repo sync -j8` for 4-core CPU

4. Build ROM

    - For fast developing and debugging, it's recommaned to disable ART by add a line `WITH_DEXPREOPT := false` to `device/lge/hammerhead/BoardConfig.mk`
    - `lunch aosp_hammerhead-userdebug` and `make -j8`

## Developing
Before pushing your local commits, please sync remote commits first:

`repo sync SBUNetSys/platform_frameworks_base`

Note: [caching github credentials](https://help.github.com/articles/caching-your-github-password-in-git/)


