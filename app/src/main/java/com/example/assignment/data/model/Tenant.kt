package com.example.assignment.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

// Every Tenant is stored as one ROW in the "tenants" table
@Entity(tableName = "tenants")
data class Tenant(

    // Each property becomes a COLUMN
    val name: String,
    val phone: String,
    val rent: String,

    // A unique number for each row
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

) : Serializable {

    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}
