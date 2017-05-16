package com.ai.yc.common.api.sysquestions.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryResponse;

/**
 * @Description: 题目查询服务
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Path("/sysquestions")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysQuestionsSV {
	
	/**
     * 题目列表查询分页
     * @return 题目列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/queryQuestionsPage
	 */
	@POST
	@Path("/queryQuestionsPage")
	public QuestionsPageQueryResponse queryQuestionsPage(QuestionsPageQueryRequest param)throws BusinessException,SystemException;
	
}