package dev.hackwithsodiq.gitng.retrofit

import com.google.gson.annotations.SerializedName

data class UserObject(
    var login:String,
    var id:Int,
    @SerializedName("avatar_url")
    var avatarUrl:String,
    @SerializedName("site_admin")
    var siteAdmin:Boolean
)