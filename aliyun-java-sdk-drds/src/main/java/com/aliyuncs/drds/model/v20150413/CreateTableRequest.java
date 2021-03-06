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

package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTableRequest extends RpcAcsRequest<CreateTableResponse> {
	   

	private String allowFullTableScan;

	private String shardKey;

	private String shardType;

	private String drdsInstanceId;

	private String dbName;

	private String ddlSql;
	public CreateTableRequest() {
		super("Drds", "2015-04-13", "CreateTable", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAllowFullTableScan() {
		return this.allowFullTableScan;
	}

	public void setAllowFullTableScan(String allowFullTableScan) {
		this.allowFullTableScan = allowFullTableScan;
		if(allowFullTableScan != null){
			putQueryParameter("AllowFullTableScan", allowFullTableScan);
		}
	}

	public String getShardKey() {
		return this.shardKey;
	}

	public void setShardKey(String shardKey) {
		this.shardKey = shardKey;
		if(shardKey != null){
			putQueryParameter("ShardKey", shardKey);
		}
	}

	public String getShardType() {
		return this.shardType;
	}

	public void setShardType(String shardType) {
		this.shardType = shardType;
		if(shardType != null){
			putQueryParameter("ShardType", shardType);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDdlSql() {
		return this.ddlSql;
	}

	public void setDdlSql(String ddlSql) {
		this.ddlSql = ddlSql;
		if(ddlSql != null){
			putQueryParameter("DdlSql", ddlSql);
		}
	}

	@Override
	public Class<CreateTableResponse> getResponseClass() {
		return CreateTableResponse.class;
	}

}
