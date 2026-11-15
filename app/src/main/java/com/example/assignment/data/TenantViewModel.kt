package com.example.assignment.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment.data.TenantDatabase
import com.example.assignment.data.TenantRepository
import com.example.assignment.data.model.Tenant
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TenantViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: TenantRepository

    val allTenants: StateFlow<List<Tenant>>

    init {
        val tenantDao = TenantDatabase.getDatabase(application).tenantDao()
        repository = TenantRepository(tenantDao)
        allTenants = repository.allTenants.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )
    }

    fun insert(tenant: Tenant) = viewModelScope.launch {
        repository.insert(tenant)
    }
}
