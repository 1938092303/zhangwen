package com.zw.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;

@Component
public class ElasticJobHandler {

	@Autowired
	private ZookeeperRegistryCenter zookeeperRegistryCenter;
	@Autowired
	private ElasticJobListener elasticJobListener;

	/**
	 * @param jobName
	 * @param jobClass
	 * @param shardingTotalCount
	 * @param cron
	 * @param id
	 *            数据ID
	 * @return
	 */
	private static LiteJobConfiguration.Builder simpleJobConfigBuilder(String jobName,Class<? extends SimpleJob> jobClass, int shardingTotalCount, String cron, String id, String parameters) {
		return LiteJobConfiguration.newBuilder(new SimpleJobConfiguration(JobCoreConfiguration.newBuilder(jobName, cron, shardingTotalCount).shardingItemParameters(parameters).jobParameter(id).build(),jobClass.getCanonicalName()));
	}

	/**
	 * 添加一个定时任务
	 *
	 * @param jobName
	 *            任务名
	 * @param cron
	 *            表达式
	 * @param shardingTotalCount
	 *            分片数
	 * @param parameters
	 *            当前参数
	 */
	public void addJob(String jobName, String cron, Integer shardingTotalCount, String id, String parameters) {
		LiteJobConfiguration jobConfig = simpleJobConfigBuilder(jobName, MyJob.class, shardingTotalCount, cron, id,
				parameters).overwrite(true).build();
		new SpringJobScheduler(new MyJob(), zookeeperRegistryCenter, jobConfig, elasticJobListener).init();
	}

}
