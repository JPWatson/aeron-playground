ARG JAVA_VERSION=11
FROM azul/zulu-openjdk:${JAVA_VERSION}

RUN apt-get update && \
    apt-get -s dist-upgrade | grep "^Inst" | \
        grep -i securi | awk -F " " {'print $2'} | \
        xargs apt-get install && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
        bash \
        iproute2 \
        uuid \
        curl \
        tzdata \
        unzip && \
    apt-get remove -y build-essential && \
    apt-get autoremove -y && \
    rm -rf /var/lib/apt/lists/*

RUN useradd -r -u 950 -g users -c hydra -d /training training && \
    mkdir -p /training && \
    chown training:users /training

USER training

ENV ENTRY_POINT io.aeron.driver.MediaDriver
ENV CLASSPATH /training/lib/*
ENV JVM_ARGS ""

COPY build/libs/* /training/lib/
COPY scripts/* /training/bin/

ENV PATH="/training/bin:${PATH}"
ENTRYPOINT [ "entrypoint.sh" ]
