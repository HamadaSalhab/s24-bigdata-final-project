
# Import train data from hadoop to the cluster
hdfs dfs -get project/data/train/part-00000-a5d1dd23-fe88-4c7e-88a0-8a07fbc3b05b-c000.json ~/s24-bigdata-final-project/data/train.json

# Import test data from hadoop to the cluster
hdfs dfs -get project/data/test/part-00000-b2758903-57d2-4c6a-adc0-43a2a7aa135e-c000.json ~/s24-bigdata-final-project/data/test.json

# Get model1 from the cluster
hdfs dfs -get project/models/model2 s24-bigdata-final-project/model/model2

# Get model2 from the cluster
hdfs dfs -get project/models/model2 s24-bigdata-final-project/model/model2
