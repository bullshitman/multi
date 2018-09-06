package com.aparatus.multiapp;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

public class CurrentUser {
    public static String getAccessToken(){
        if (VKAccessToken.currentToken() != null){
            return VKAccessToken.currentToken().accessToken;
        }else {
            return null;
        }
    }
    public static String getId(){
        if (VKAccessToken.currentToken() != null){
            return VKAccessToken.currentToken().userId;
        }else {
            return null;
        }
    }
    public static boolean isAutorized(){
        return VKSdk.isLoggedIn()
                && VKAccessToken.currentToken() != null
                && !VKAccessToken.currentToken().isExpired();
    }
}
