package com.mobile.goal.domain.repository

import com.mobile.goal.domain.model.organization.OrganizationResponse

interface OrganizationRepository {
    suspend fun getOrganization(): OrganizationResponse?
}