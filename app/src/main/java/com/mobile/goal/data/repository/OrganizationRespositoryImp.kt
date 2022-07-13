package com.mobile.goal.data.repository

import com.mobile.goal.data.remote.Api
import com.mobile.goal.domain.model.organization.OrganizationResponse
import com.mobile.goal.domain.repository.OrganizationRepository
import javax.inject.Inject

class OrganizationRepositoryImp @Inject constructor(
    private val api: Api
) : OrganizationRepository{
    override suspend fun getOrganization(): OrganizationResponse? {
      return  api.getOrganization()
    }
}