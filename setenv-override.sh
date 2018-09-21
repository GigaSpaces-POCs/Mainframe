
## **********************************************************************************************************
##  Use this script to override default settings in the setenv.sh script.                                   *
##  The setenv script is used to initialize common environment to GigaSpaces XAP Server.                    *
##  The setenv script calls this script to allow overriding those settings easily.                          *
##  For more information see http://docs.gigaspaces.com/xap/12.3/started/common-environment-variables.html *
## **********************************************************************************************************

## Here are some environment variables which are commonly modified:
## export JAVA_HOME=...
## export XAP_LOOKUP_GROUPS=...
## export XAP_LOOKUP_LOCATORS=...
## export XAP_MANAGER_SERVERS=...
## export XAP_NIC_ADDRESS=...
## export XAP_PUBLIC_HOST=...
## export XAP_CLASSPATH_EXT=...
## export EXT_JAVA_OPTIONS=...

export EXT_JAVA_OPTIONS="-Xms740096m -Xmx740096m -Ddb2.jcc.charsetDecoderEncoder=3 -Dsun.rmi.dgc.client.gcInterval=36000000 -Dsun.rmi.dgc.server.gcInterval=36000000 -XX:+ExplicitGC$
export XAP_GSC_OPTIONS=${XAP_GSC_OPTIONS=-Xms740096m -Xmx740096m}
export XAP_MANAGER_OPTIONS=${XAP_MANAGER_OPTIONS=-Xmx740096m}
export XAP_GSM_OPTIONS=${XAP_GSM_OPTIONS=-Xmx740096m}
export XAP_GSA_OPTIONS=${XAP_GSA_OPTIONS=-Xmx740096m}
export XAP_LUS_OPTIONS=${XAP_LUS_OPTIONS=-Xmx740096m}
export XAP_ESM_OPTIONS=${XAP_ESM_OPTIONS=-Xmx740096m}
export XAP_CLI_OPTIONS=${XAP_CLI_OPTIONS=-Xmx740096m}
export XAP_GUI_OPTIONS=${XAP_GUI_OPTIONS=-Xmx740096m}
export XAP_WEBUI_OPTIONS=${XAP_WEBUI_OPTIONS=-Xmx740096m}




