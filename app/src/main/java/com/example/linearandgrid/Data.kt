package com.example.linearandgrid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(val image1: Int, val title: String) : Parcelable

