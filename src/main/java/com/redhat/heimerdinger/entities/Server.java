package com.redhat.heimerdinger.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "server")
public class Server extends PanacheEntityBase {

  @Id
  @Column(name = "host_name")
  private String hostName;

  @Column(name = "node_name")
  private String nodeName;

  private String version;
  
  @OneToMany(mappedBy = "hostName", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Update> updates;

  public Server() {
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  } 

  public static Server findByHostName(String hostName) {
    return find("host_name", hostName).firstResult();
  }

  public Set<Update> getUpdates() {
    return updates;
  }

  public void setUpdates(Set<Update> updates) {
    this.updates = updates;
  }


}
