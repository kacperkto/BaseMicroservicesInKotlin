INSERT INTO CHECKPOINT_DEFININTIONS (checkpoint, camera_definitionId) VALUES
  ('PCV', 11),
  ('FA1', 14),
  ('FA15',16);

INSERT INTO DATA_TEST (bodyid, id_checkpoit,result) VALUES
  ('69202060732539', 1,true),
  ('69202060732539', 2,false),
  ('69202060732539',3,true),
  ('69202060732579', 1,true),
  ('69202060732579', 2,false),
  ('69202060732529',3,true),
  ('69202060732519', 1,true),
  ('69202060732549', 2,false),
  ('69202060732549',3,true),
  ('69202060732559', 1,true),
  ('69202060732559', 2,false),
  ('69202060732589',3,true);