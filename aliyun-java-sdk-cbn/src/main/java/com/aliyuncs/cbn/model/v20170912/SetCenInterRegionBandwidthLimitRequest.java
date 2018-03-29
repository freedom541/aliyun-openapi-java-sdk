/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetCenInterRegionBandwidthLimitRequest extends RpcAcsRequest<SetCenInterRegionBandwidthLimitResponse> {
	
	public SetCenInterRegionBandwidthLimitRequest() {
		super("Cbn", "2017-09-12", "SetCenInterRegionBandwidthLimit", "cbn");
	}

	private String localRegionId;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String cenId;

	private String ownerAccount;

	private String oppositeRegionId;

	private Long bandwidthLimit;

	private Long ownerId;

	public String getLocalRegionId() {
		return this.localRegionId;
	}

	public void setLocalRegionId(String localRegionId) {
		this.localRegionId = localRegionId;
		if(localRegionId != null){
			putQueryParameter("LocalRegionId", localRegionId);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getOppositeRegionId() {
		return this.oppositeRegionId;
	}

	public void setOppositeRegionId(String oppositeRegionId) {
		this.oppositeRegionId = oppositeRegionId;
		if(oppositeRegionId != null){
			putQueryParameter("OppositeRegionId", oppositeRegionId);
		}
	}

	public Long getBandwidthLimit() {
		return this.bandwidthLimit;
	}

	public void setBandwidthLimit(Long bandwidthLimit) {
		this.bandwidthLimit = bandwidthLimit;
		if(bandwidthLimit != null){
			putQueryParameter("BandwidthLimit", bandwidthLimit.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<SetCenInterRegionBandwidthLimitResponse> getResponseClass() {
		return SetCenInterRegionBandwidthLimitResponse.class;
	}

}