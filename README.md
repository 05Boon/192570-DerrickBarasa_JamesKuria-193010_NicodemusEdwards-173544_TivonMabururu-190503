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
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room
## Team
| Stage | Member | Admission No. | Pull request |
|---|---|---|---|
| 1 Lead | Chebulobi Derrick Barasa| 192570 | (link) |
| 2 ViewModel | James Kuria| 193010 | (https://github.com/05Boon/Practical-assignments-192570-Chebulobi-Derrick-Barasa-/pull/1) |
| 3 Room | Tivon Mabururu | 190503 | (https://github.com/05Boon/Practical-assignments-192570-Chebulobi-Derrick-Barasa-/pull/2) |
| 4 Screens | Nicodemus Edwards| 173544 | (https://github.com/05Boon/Practical-assignments-192570-Chebulobi-Derrick-Barasa-/pull/3) |
| 5 Data integration | Chebulobi Derrick Barasa| 192570 | (https://github.com/05Boon/Practical-assignments-192570-Chebulobi-Derrick-Barasa-/pull/4)