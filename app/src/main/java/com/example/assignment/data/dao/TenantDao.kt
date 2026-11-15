package com.example.assignment.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.assignment.data.model.Tenant
import kotlinx.coroutines.flow.Flow

// Defines the operations we can perform on the tenants table
@Dao
interface TenantDao {

    // Inserts a tenant into the database
    @Insert
    suspend fun insertTenant(tenant: Tenant)

    // Retrieves all tenants, ordered alphabetically by name
    @Query("SELECT * FROM tenants ORDER BY name")
    fun getAllTenants(): Flow<List<Tenant>>
}
