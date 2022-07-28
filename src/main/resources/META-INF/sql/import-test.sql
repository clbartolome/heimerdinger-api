-- Import Script for testing and local dev

CREATE TABLE IF NOT EXISTS  server ( 
  host_name VARCHAR (255) PRIMARY KEY, 
  node_name VARCHAR (255), 
  version VARCHAR ( 255 ));

INSERT INTO server(host_name, node_name, version ) VALUES ('win-cli-1', 'win-cli-1.redhat.local', 'Microsoft Windows Server 2016 Datacenter');
INSERT INTO server(host_name, node_name, version ) VALUES ('win-cli-22', 'win-cli-22.redhat.local', 'Microsoft Windows Server 2019 Datacenter');

ALTER SEQUENCE IF EXISTS hibernate_sequence RESTART WITH 3;

