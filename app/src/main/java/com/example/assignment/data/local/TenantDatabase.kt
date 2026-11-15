package com.example.assignment.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assignment.data.model.Tenant

// Defines the tables held by the database
@Database(entities = [Tenant::class], version = 1)
abstract class TenantDatabase : RoomDatabase() {

    // Gives access to the TenantDao
    abstract fun tenantDao(): TenantDao

    companion object {

        // Only one database instance for the whole app
        @Volatile
        private var INSTANCE: TenantDatabase? = null

        fun getDatabase(context: Context): TenantDatabase {

            return INSTANCE ?: synchronized(this) {

                val database = Room.databaseBuilder(
                    context.applicationContext,
                    TenantDatabase::class.java,
                    "tenant_database"
                ).build()

                INSTANCE = database
                database
            }
        }
    }
}
