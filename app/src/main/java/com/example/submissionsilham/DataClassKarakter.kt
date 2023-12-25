package com.example.submissionsilham

import android.os.Parcel
import android.os.Parcelable


data class DataClassKarakter(
    val name: String?,
    val image: Int,
    val detail: String?,
    val deskripsi: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
        parcel.writeString(detail)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataClassKarakter> {
        override fun createFromParcel(parcel: Parcel): DataClassKarakter {
            return DataClassKarakter(parcel)
        }

        override fun newArray(size: Int): Array<DataClassKarakter?> {
            return arrayOfNulls(size)
        }
    }
}
