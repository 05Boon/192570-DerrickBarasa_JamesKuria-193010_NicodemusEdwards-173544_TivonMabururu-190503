# Tenant Management System

An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
`ui/`    Activities, Fragments and TenantViewModel (UI layer)  
`data/`  Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)  

Screens → TenantViewModel (LiveData) → TenantRepository → Room

## Team
| Stage | Member | Admission No. | Pull request |
|---|---|---|---|
| 1 Lead | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
| 2 ViewModel | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
| 3 Room | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
| 4 Screens | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
| 5 Data integration | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
| 6 Release | Chebulobi Derrick Barasa | 192570 | [v1.0 Release](https://github.com/05Boon/lab-5-192570-Chebulobi-Derrick-Barasa-) |
