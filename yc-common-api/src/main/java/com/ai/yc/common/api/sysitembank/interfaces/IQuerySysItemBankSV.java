package com.ai.yc.common.api.sysitembank.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.sysitembank.param.DeleteSysItemBank;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryResponse;
import com.ai.yc.common.api.sysitembank.param.SaveSysItemBank;

/**
 * @Description: 题库管理服务
 * @author shancc
 * @version V1.0
 */
@Path("/querysysitembank")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysItemBankSV {
	
	/**
     * 题库列表查询分页
     * @return 题库列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysitembank/queryItemBankPage
	 */
	@POST
	@Path("/queryItemBankPage")
	public ItemBankPageQueryResponse queryItemBankPage(ItemBankPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加题库
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysitembank/saveSysItemBank
     */
	@POST
	@Path("/saveSysItemBank")
	public BaseResponse saveSysItemBank(SaveSysItemBank req)throws BusinessException,SystemException;
	
	/**
	 * 删除
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysitembank/deleteSysItemBank
     */
	@POST
	@Path("/deleteSysItemBank")
	public Integer deleteSysItemBank(DeleteSysItemBank param)throws BusinessException,SystemException;
	
	/**
	 * 修改用途
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysitembank/updateSysItemBank
     */
	@POST
	@Path("/updateSysItemBank")
	public BaseResponse updateSysItemBank(SaveSysItemBank req)throws BusinessException,SystemException;
}
