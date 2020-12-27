package demo

public class gitCheckout{
    def getCode(String REPO_NAME, String branch){
        
        checkout([$class: 'GitSCM',branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'Github', url: 'https://github.com/shrikantrshelke/todo.git']]])
    }
}