package com.redhat.heimerdinger.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "update")
public class Update extends PanacheEntityBase {

  @Id
  private String id;

  private String kb;

  private String tittle;

  private String status;
  
  @Column(name = "host_name")
  private String hostName;

  @Column(name = "job_link")
  private String jobLink;

  public Update() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKb() {
    return kb;
  }

  public void setKb(String kb) {
    this.kb = kb;
  }

  public String getTittle() {
    return tittle;
  }

  public void setTittle(String tittle) {
    this.tittle = tittle;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getJobLink() {
    return jobLink;
  }

  public void setJobLink(String jobLink) {
    this.jobLink = jobLink;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

}
