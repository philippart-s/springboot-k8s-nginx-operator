package fr.wilda.nginxoperator.resource;

public class NginxInstallerSpec {

    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }
}
