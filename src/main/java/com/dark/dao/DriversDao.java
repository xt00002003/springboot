/**
 * 
 */
package com.dark.dao;


import com.dark.entity.Drivers;

/**
* @Description: 持久层接口定义
* @author lifei
* @date 2017年2月23日 下午4:19:17 
*/
public interface DriversDao {

    Long selectCount(Drivers drivers);
    
}