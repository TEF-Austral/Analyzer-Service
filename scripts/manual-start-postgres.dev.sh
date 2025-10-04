#!/usr/bin/env bash

docker run --name=analyzer_db --rm -p 5436:5432 \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_USER=sa \
  -e POSTGRES_DB=analyzer_db \
  postgres:16
