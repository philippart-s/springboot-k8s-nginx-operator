package fr.wilda.nginxoperator.operator;

import org.springframework.stereotype.Component;
import fr.wilda.nginxoperator.controller.NginxInstallerController;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.Operator;

@Component
public class NginxOperator {

    private final Operator operator;

    private final KubernetesClient kubernetesClient;

    private final NginxInstallerController nginxInstallerController;

    public NginxOperator(Operator operator, KubernetesClient kubernetesClient,
            NginxInstallerController nginxInstallerController) {
        this.operator = operator;
        this.kubernetesClient = kubernetesClient;
        this.nginxInstallerController = nginxInstallerController;
    }
}