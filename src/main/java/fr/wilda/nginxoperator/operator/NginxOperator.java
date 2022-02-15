package fr.wilda.nginxoperator.operator;

import fr.wilda.nginxoperator.controller.NginxInstallerReconciler;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.Operator;

public class NginxOperator {

    private final Operator operator;

    private final KubernetesClient kubernetesClient;

    private final NginxInstallerReconciler nginxInstallerController;

    public NginxOperator(Operator operator, KubernetesClient kubernetesClient,
            NginxInstallerReconciler nginxInstallerController) {
        this.operator = operator;
        this.kubernetesClient = kubernetesClient;
        this.nginxInstallerController = nginxInstallerController;
    }
}
