/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.commands.strong;

import android.app.ActivityManagerNative;
import android.app.IActivityManager;
import android.app.IActivityManager.ContentProviderHolder;
import android.content.IContentProvider;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.UserHandle;

public final class strong {
    static final String TAG = "strong";

    static String[] mArgs;
    int mNextArg;
    static int value = 0;

    public static void main(String[] args) {
        int c;

        printUsage();
        System.err.println("Wellcom strong test function!!");
     
        try {
            new strong().run();
        } catch (Exception e) {
            System.err.println("Unable to run settings command");
        }
    }

    public void run() {

        try {
            System.err.println("Now strong run() again");
        } catch (Exception e) {
            System.err.println("Now strong run() Exception");
        }

    }

    private String nextArg() {
        if (mNextArg >= mArgs.length) {
            return null;
        }
        String arg = mArgs[mNextArg];
        mNextArg++;
        return arg;
    }

    private static void printUsage() {
        System.err.println("usage:  strong -a -b -h");
        System.err.println("'a' is for add");
        System.err.println("-h for help");
    }
}  