ALTER TABLE licenses ADD COLUMN status  VARCHAR NOT NULL DEFAULT 'PENDING';
UPDATE licenses SET status = 'APPROVED';