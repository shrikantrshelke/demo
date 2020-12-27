def call(String configPath) {
  
  def workspace

  def startTime = LocalDateTime.now()
  node('master') {
    stage('prepare') {
        workspace = env.WORKSPACE
        println(workspace)
        println(configPath)
    }
  }
}