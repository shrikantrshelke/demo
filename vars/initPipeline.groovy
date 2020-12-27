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
        gitcheckout = new gitCheckout()
        gitcheckout.getCode("${GIT_REPO}","${BRANCH_NAME}")
        configPath = workspace + "/" + configPath
        println(configPath)

        def pipelineConfig = readYaml (file: configPath) 
        println(pipelineConfig)
    }
  }
}