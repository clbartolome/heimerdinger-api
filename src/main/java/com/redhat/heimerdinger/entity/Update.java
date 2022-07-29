package com.redhat.heimerdinger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "update")
public class Update extends PanacheEntityBase {

  @Id
  private String id;

  private String kb;

  private String tittle;

  private String status;

  @JsonBackReference
  @ManyToOne(targetEntity = Server.class, fetch = FetchType.LAZY)
  @JoinColumn(name = "server_host_name", referencedColumnName = "host_name", updatable = true, insertable = true)
  private Server server;

  @Column(name = "job_link")
  private String jobLink;

  private String categories;

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

  public Server getServer() {
    return server;
  }

  public void setServer(Server server) {
    this.server = server;
  }

  public String getCategories() {
    return categories;
  }

  public void setCategories(String categories) {
    this.categories = categories;
  }

}
