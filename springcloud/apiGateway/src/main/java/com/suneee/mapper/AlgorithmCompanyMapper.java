package com.suneee.mapper;

import com.suneee.entity.AlgorithmCompany;
import com.suneee.entity.AlgorithmCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlgorithmCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    long countByExample(AlgorithmCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int deleteByExample(AlgorithmCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int deleteByPrimaryKey(Integer relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int insert(AlgorithmCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int insertSelective(AlgorithmCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    List<AlgorithmCompany> selectByExample(AlgorithmCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    AlgorithmCompany selectByPrimaryKey(Integer relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") AlgorithmCompany record, @Param("example") AlgorithmCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int updateByExample(@Param("record") AlgorithmCompany record, @Param("example") AlgorithmCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int updateByPrimaryKeySelective(AlgorithmCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    int updateByPrimaryKey(AlgorithmCompany record);
}