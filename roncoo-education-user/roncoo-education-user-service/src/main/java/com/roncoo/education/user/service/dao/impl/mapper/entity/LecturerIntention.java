package com.roncoo.education.user.service.dao.impl.mapper.entity;

import java.util.Date;

public class LecturerIntention {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte statusId;

    private Long userNo;

    private String mobile;

    private String idNumber;

    private String positiveIdImgUrl;

    private String negativeIdImgUrl;

    private String wechat;

    private String email;

    private String qq;

    private String education;

    private String school;

    private String degreeImgUrl;

    private String diplomaImgUrl;

    private String studentImgUrl;

    private String tqcNumber;

    private String tqcImgUrl;

    private String province;

    private String city;

    private String address;

    private String grade;

    private String subject;

    private String experience;

    private String award;

    private String achievement;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Byte getStatusId() {
        return statusId;
    }

    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getPositiveIdImgUrl() {
        return positiveIdImgUrl;
    }

    public void setPositiveIdImgUrl(String positiveIdImgUrl) {
        this.positiveIdImgUrl = positiveIdImgUrl == null ? null : positiveIdImgUrl.trim();
    }

    public String getNegativeIdImgUrl() {
        return negativeIdImgUrl;
    }

    public void setNegativeIdImgUrl(String negativeIdImgUrl) {
        this.negativeIdImgUrl = negativeIdImgUrl;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getDegreeImgUrl() {
        return degreeImgUrl;
    }

    public void setDegreeImgUrl(String degreeImgUrl) {
        this.degreeImgUrl = degreeImgUrl == null ? null : degreeImgUrl.trim();
    }

    public String getDiplomaImgUrl() {
        return diplomaImgUrl;
    }

    public void setDiplomaImgUrl(String diplomaImgUrl) {
        this.diplomaImgUrl = diplomaImgUrl == null ? null : diplomaImgUrl.trim();
    }

    public String getStudentImgUrl() {
        return studentImgUrl;
    }

    public void setStudentImgUrl(String studentImgUrl) {
        this.studentImgUrl = studentImgUrl == null ? null : studentImgUrl.trim();
    }

    public String getTqcNumber() {
        return tqcNumber;
    }

    public void setTqcNumber(String tqcNumber) {
        this.tqcNumber = tqcNumber == null ? null : tqcNumber.trim();
    }

    public String getTqcImgUrl() {
        return tqcImgUrl;
    }

    public void setTqcImgUrl(String tqcImgUrl) {
        this.tqcImgUrl = tqcImgUrl == null ? null : tqcImgUrl.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award == null ? null : award.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}