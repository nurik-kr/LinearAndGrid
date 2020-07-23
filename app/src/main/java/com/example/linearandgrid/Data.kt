package com.example.linearandgrid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data (val id:Int,val title:String) : Parcelable {

}
