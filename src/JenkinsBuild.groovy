      import jenkins.model.Jenkins
      import hudson.security.SecurityRealm
      import org.jenkinsci.plugins.GithubSecurityRealm
      import jenkins.plugins.git.GitSCMSource
      import jenkins.plugins.git.traits.BranchDiscoveryTrait
      import org.jenkinsci.plugins.workflow.libs.GlobalLibraries
      import org.jenkinsci.plugins.workflow.libs.LibraryConfiguration
      import org.jenkinsci.plugins.workflow.libs.SCMSourceRetriever
      import net.sf.json.JSONObject
      import hudson.*
      import hudson.security.*
      import jenkins.model.*
      import java.util.*
      import com.michelin.cio.hudson.plugins.rolestrategy.*
      import com.synopsys.arc.jenkins.plugins.rolestrategy.*
      import java.lang.reflect.*
      import java.util.logging.*
      import groovy.json.*
      import groovy.json.JsonSlurper
      import jenkins.model.Jenkins
def call() { 
        node {
        stage ("succuss") {
                        echo "Hello"
                }
        }
}