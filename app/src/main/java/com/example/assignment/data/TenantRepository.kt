package com.example.assignment.data

import com.example.assignment.data.dao.TenantDao
import com.example.assignment.data.model.Tenant
import kotlinx.coroutines.flow.Flow

class TenantRepository(private val tenantDao: TenantDao) {

    val allTenants: Flow<List<Tenant>> = tenantDao.getAllTenants()

    suspend fun insert(tenant: Tenant) {
        tenantDao.insertTenant(tenant)
    }
}