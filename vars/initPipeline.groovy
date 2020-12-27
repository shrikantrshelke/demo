import java.time.LocalDateTime
import demo.*
def call(String configPath) {
  
  def workspace

  def startTime = LocalDateTime.now()
  node('master') {
    stage('prepare') {
        workspace = env.WORKSPACE
        println(workspace)
        println(configPath)
        println("${BRANCH_NAME}")
        println("${GIT_REPO}")
        checkout([$class: 'GitSCM',
        branches: [[name: "*/${BRANCH_NAME}"]],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[credentialsId: 'Github', url: "${GIT_REPO}"]]])
        echo "ls -al"
        configPath = workspace + "/" + configPath
        println(configPath)

        def pipelineConfig = readYaml (file: configPath) 
        println(pipelineConfig)
    }
  }
}