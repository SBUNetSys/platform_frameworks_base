# Copyright 2011 The Android Open Source Project  
#
LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := $(call all-subdir-java-files)
LOCAL_MODULE := strong 
include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)  
LOCAL_MODULE := strong 
LOCAL_SRC_FILES := strong
LOCAL_MODULE_CLASS := EXECUTABLES
LOCAL_MODULE_TAGS := optional
include $(BUILD_PREBUILT)
