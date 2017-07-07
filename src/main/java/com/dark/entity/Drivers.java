package com.dark.entity;


import java.io.Serializable;
import java.util.Date;

public class Drivers implements Serializable {
	private static final long serialVersionUID = 1L;
	
    /**
     * 主键
     */
    private Long did;

    /**
     * 司机编码
     */
    private String dcode;

    /**
     * 司机姓名
     */
    private String dname;

    /**
     * 司机性别
     * 0-女 1-男
     */
    private Byte sex;

    /**
     * 联系方式
     */
    private String phone;

    /**
     *身份证号码
     */
    private String idno;

    /**
     * 家庭住址
     */
    private String addr;

    /**
     * 驾照类型
     */
    private Byte dltype;

    /**
     * 驾照编码
     */
    private String dlno;

    /**
     * 初次领取驾照时间
     */
    private Date dlrdate;

    /**
     * 驾照截止日期
     */
    private Date dledate;

    /**
     * 出生日期
     */
    private Date birthdate;

    /**
     * 身份证附件地址
     */
    private String idimg;

    /**
     * 驾照附件地址
     */
    private String dlimg;

    /**
     * 合同附件地址
     */
    private String cimg;

    /**
     * 司机状态
     * 0-停用  1-启用
     * 默认：启用
     */
    private Byte state;

    /**
     * 与车主合同
     */
    private String contract;

    /**
     * 备注
     */
    private String remark;
    
    /**
     * 创建时间
     */
    private Date createtime = new Date();
    
    /**
     * 创建者
     */
    private String createuser;
    
    
    
    
    /**
     * @return the createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime the createtime to set
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return the createuser
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * @param createuser the createuser to set
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }
    /**
     * 用于存储年龄
     */
    private Integer age;

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the value of tms_drivers.did
     */
    public Long getDid() {
        return did;
    }

    /**
     * @param did the value for tms_drivers.did
     */
    public void setDid(Long did) {
        this.did = did;
    }

    /**
     * @return the value of tms_drivers.dcode
     */
    public String getDcode() {
        return dcode;
    }

    /**
     * @param dcode the value for tms_drivers.dcode
     */
    public void setDcode(String dcode) {
        this.dcode = dcode == null ? null : dcode.trim();
    }

    /**
     * @return the value of tms_drivers.dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname the value for tms_drivers.dname
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * @return the value of tms_drivers.sex
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * @param sex the value for tms_drivers.sex
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * @return the value of tms_drivers.phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the value for tms_drivers.phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return the value of tms_drivers.idno
     */
    public String getIdno() {
        return idno;
    }

    /**
     * @param idno the value for tms_drivers.idno
     */
    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    /**
     * @return the value of tms_drivers.addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr the value for tms_drivers.addr
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * @return the value of tms_drivers.dltype
     */
    public Byte getDltype() {
        return dltype;
    }

    /**
     * @param dltype the value for tms_drivers.dltype
     */
    public void setDltype(Byte dltype) {
        this.dltype = dltype;
    }

    /**
     * @return the value of tms_drivers.dlno
     */
    public String getDlno() {
        return dlno;
    }

    /**
     * @param dlno the value for tms_drivers.dlno
     */
    public void setDlno(String dlno) {
        this.dlno = dlno == null ? null : dlno.trim();
    }

    /**
     * @return the value of tms_drivers.dlrdate
     */
    public Date getDlrdate() {
        return dlrdate;
    }

    /**
     * @param dlrdate the value for tms_drivers.dlrdate
     */
    public void setDlrdate(Date dlrdate) {
        this.dlrdate = dlrdate;
    }

    /**
     * @return the value of tms_drivers.dledate
     */
    public Date getDledate() {
        return dledate;
    }

    /**
     * @param dledate the value for tms_drivers.dledate
     */
    public void setDledate(Date dledate) {
        this.dledate = dledate;
    }

    /**
     * @return the value of tms_drivers.birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the value for tms_drivers.birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the value of tms_drivers.idimg
     */
    public String getIdimg() {
        return idimg;
    }

    /**
     * @param idimg the value for tms_drivers.idimg
     */
    public void setIdimg(String idimg) {
        this.idimg = idimg == null ? null : idimg.trim();
    }

    /**
     * @return the value of tms_drivers.dlimg
     */
    public String getDlimg() {
        return dlimg;
    }

    /**
     * @param dlimg the value for tms_drivers.dlimg
     */
    public void setDlimg(String dlimg) {
        this.dlimg = dlimg == null ? null : dlimg.trim();
    }

    /**
     * @return the value of tms_drivers.cimg
     */
    public String getCimg() {
        return cimg;
    }

    /**
     * @param cimg the value for tms_drivers.cimg
     */
    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    /**
     * @return the value of tms_drivers.state
     */
    public Byte getState() {
        return state;
    }

    /**
     * @param state the value for tms_drivers.state
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * @return the value of tms_drivers.contract
     */
    public String getContract() {
        return contract;
    }

    /**
     * @param contract the value for tms_drivers.contract
     */
    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    /**
     * @return the value of tms_drivers.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the value for tms_drivers.remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}