package com.pojo;

import java.sql.Date;
import java.util.List;

public class AdmissionProcessPreViewDto {
  private String semesterSession;
  private String title;
  private Integer intake;
  private String applicantType;
  private String academicDegree;
  private String examType;

  public AdmissionProcessPreViewDto() {
    }

  public AdmissionProcessPreViewDto(String semesterSession, String title, Integer intake, String applicantType,
                                    String academicDegree, String examType, Long noProgramChoice, Boolean allowAppeared,
                                    String writtenExamTime, Date publishDate, Date submissionLastDate,
                                    Date paymentLastDate, Date writtenExamDate, Date vivaExamDate, Boolean isPublished,
                                    String remarks, List<String> programs, List<String> locations, Boolean isActive,
                                    String termsConditions) {
    this.semesterSession = semesterSession;
    this.title = title;
    this.intake = intake;
    this.applicantType = applicantType;
    this.academicDegree = academicDegree;
    this.examType = examType;
    this.noProgramChoice = noProgramChoice;
    this.allowAppeared = allowAppeared;
    this.writtenExamTime = writtenExamTime;
    this.publishDate = publishDate;
    this.submissionLastDate = submissionLastDate;
    this.paymentLastDate = paymentLastDate;
    this.writtenExamDate = writtenExamDate;
    this.vivaExamDate = vivaExamDate;
    this.isPublished = isPublished;
    this.remarks = remarks;
    this.programs = programs;
    this.locations = locations;
    this.isActive = isActive;
    this.termsConditions = termsConditions;
  }

  private Long noProgramChoice;
  private Boolean allowAppeared;
  private String writtenExamTime;
  private Date publishDate;
  private Date submissionLastDate;
  private Date paymentLastDate;

  public Date getWrittenExamDate() {
    return writtenExamDate;
  }

  public void setWrittenExamDate(Date writtenExamDate) {
    this.writtenExamDate = writtenExamDate;
  }

  public String getSemesterSession() {
    return semesterSession;
  }

  public void setSemesterSession(String semesterSession) {
    this.semesterSession = semesterSession;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getIntake() {
    return intake;
  }

  public void setIntake(Integer intake) {
    this.intake = intake;
  }

  public String getApplicantType() {
    return applicantType;
  }

  public void setApplicantType(String applicantType) {
    this.applicantType = applicantType;
  }

  public String getAcademicDegree() {
    return academicDegree;
  }

  public void setAcademicDegree(String academicDegree) {
    this.academicDegree = academicDegree;
  }

  public String getExamType() {
    return examType;
  }

  public void setExamType(String examType) {
    this.examType = examType;
  }

  public Long getNoProgramChoice() {
    return noProgramChoice;
  }

  public void setNoProgramChoice(Long noProgramChoice) {
    this.noProgramChoice = noProgramChoice;
  }

  public Boolean getAllowAppeared() {
    return allowAppeared;
  }

  public void setAllowAppeared(Boolean allowAppeared) {
    this.allowAppeared = allowAppeared;
  }

  public String getWrittenExamTime() {
    return writtenExamTime;
  }

  public void setWrittenExamTime(String writtenExamTime) {
    this.writtenExamTime = writtenExamTime;
  }

  public Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public Date getSubmissionLastDate() {
    return submissionLastDate;
  }

  public void setSubmissionLastDate(Date submissionLastDate) {
    this.submissionLastDate = submissionLastDate;
  }

  public Date getPaymentLastDate() {
    return paymentLastDate;
  }

  public void setPaymentLastDate(Date paymentLastDate) {
    this.paymentLastDate = paymentLastDate;
  }

  public Date getVivaExamDate() {
    return vivaExamDate;
  }

  public void setVivaExamDate(Date vivaExamDate) {
    this.vivaExamDate = vivaExamDate;
  }

  public Boolean getPublished() {
    return isPublished;
  }

  public void setPublished(Boolean published) {
    isPublished = published;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public List<String> getPrograms() {
    return programs;
  }

  public void setPrograms(List<String> programs) {
    this.programs = programs;
  }

  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public String getTermsConditions() {
    return termsConditions;
  }

  public void setTermsConditions(String termsConditions) {
    this.termsConditions = termsConditions;
  }

  private Date writtenExamDate;
  private Date vivaExamDate;
  private Boolean isPublished;
  private String remarks;
  private List<String> programs;
  private List<String> locations;
  private Boolean isActive;
  private String termsConditions;
}
