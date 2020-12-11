#!/usr/bin/env groovy
package com.lib
import groovy.json.JsonSlurper
import java.text.SimpleDateFormat

node() {
   properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '3')),
               pipelineTriggers([pollSCM('* * * * *')]),
               parameters([choice(choices: ['Dev', 'Qa', 'Stage', 'Prod'], description: 'Please choose env', name: 'ENV')]),
               ])

   stage("one more stage") {
           timestamps  {
           sh """ 
           echo 'I will always say Hello again from ${ENV}!'
           export "baur='jenkins in ${ENV}'"
           ls -l
            
           """
          }
   }
          stage("Pull CSM") {
                  git 'https://github.com/fuchicorp/main-fuchicorp.git'
          }

          stage("Docker build") {
                  echo "docker build Dockerfile"
          }
          stage("Deploy env") {
                  sh """
                  ls -l
                  sleep 30
                  """
          }
          stage("create file") {
                  sh """
                echo "hello"
                if [ ! -d /tmp/foo.txt ]
                then
                        echo "file not found"
                        touch /tmp/foo.txt
                else
                echo "file exist"
                fi
                  """
          }
          stage("cleanUp") {
                  cleanWs()
          }
}
