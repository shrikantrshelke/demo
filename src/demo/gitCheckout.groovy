package demo

public class getCheckout{
    def getCode(String REPO_NAME, String branch){
        checkout changelog: false, poll: false,
        scm: [$class: 'GitSCM',
        branches: [[name: '*/'+ branch]],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: 'Github', url: REPO_NAME]]]
    }
}