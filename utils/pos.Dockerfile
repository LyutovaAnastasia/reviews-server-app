FROM postgres:latest
COPY scripts/init.sql /docker-entrypoint-initdb.d/


