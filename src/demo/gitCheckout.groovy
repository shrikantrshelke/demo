package demo

public class gitCheckout{
    def getCode(String REPO_NAME, String branch){
        
        checkout([$class: 'GitSCM',
        branches: [[name: '*/' + branch]],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: 'Github', url: REPO_NAME]]])
    }
}