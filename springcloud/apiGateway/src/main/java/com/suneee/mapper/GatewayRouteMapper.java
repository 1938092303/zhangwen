package com.suneee.mapper;

import com.suneee.entity.GatewayRoute;
import com.suneee.entity.GatewayRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayRouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    long countByExample(GatewayRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int deleteByExample(GatewayRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int insert(GatewayRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int insertSelective(GatewayRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    List<GatewayRoute> selectByExample(GatewayRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    GatewayRoute selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") GatewayRoute record, @Param("example") GatewayRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int updateByExample(@Param("record") GatewayRoute record, @Param("example") GatewayRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int updateByPrimaryKeySelective(GatewayRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gateway_route
     *
     * @mbg.generated Mon Jun 25 09:24:05 CST 2018
     */
    int updateByPrimaryKey(GatewayRoute record);
}