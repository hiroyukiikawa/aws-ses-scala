#!/usr/bin/env bash

java -Dsbt.log.noformat=true -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx512M -Xss2M -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar `dirname $0`/sbt-launch.jar "$@"
