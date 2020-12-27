import java.time.LocalDateTime
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

        configPath = workspace + "/" + configPath
        println(configPath)
    }
  }
}