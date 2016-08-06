# platform_frameworks_base

AOSP Framework base modifications for UIWear

## Basic workflow

### First time

1. install Android SDK

`wget http://dl.google.com/android/android-sdk_r24.4.1-linux.tgz`

2. configure Android build environment
`sudo apt-get install bison build-essential curl flex git gnupg gperf libesd0-dev liblz4-tool libncurses5-dev libsdl1.2-dev  libxml2 libxml2-utils lzop maven openjdk-8-jdk pngcrush schedtool squashfs-tools xsltproc zip zlib1g-dev g++-multilib gcc-multilib lib32ncurses5-dev lib32readline6-dev lib32z1-dev libwxgtk3.0-dev`
also see https://source.android.com/source/initializing.html

3. sync source code

`cd your_working_dir`
`repo init -u https://android.googlesource.com/platform/manifest`
`repo sync`

4. add local manifest file as described in the following section

## Local manifest configuration
below is the local manifest file(whatever.xml) located in .repo/local_manifests

```xml 
<?xml version="1.0" encoding="UTF-8"?>
<manifest>

  <remote name="origin" fetch="git://github.com/" />

  <remove-project name="platform/frameworks/base" />

  <project path="frameworks/base" name="SBUNetSys/platform_frameworks_base" remote="origin" />

</manifest>
```

### Develop

in source root dir, `repo sync SBUNetSys/platform_frameworks_base`

ps: caching github credentials
```bash
git config --global credential.helper cache
# Set git to use the credential memory cache
and
git config --global credential.helper 'cache --timeout=3600'
# Set the cache to timeout after 1 hour (setting is in seconds)
```
https://help.github.com/articles/caching-your-github-password-in-git/#platform-linux
