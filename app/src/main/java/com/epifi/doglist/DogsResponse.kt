package com.epifi.doglist

import com.google.gson.annotations.SerializedName

data class DogsResponse(@SerializedName("statues")var status:String,
                        @SerializedName("message")var images:List<String>)










