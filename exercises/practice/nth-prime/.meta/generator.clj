(ns nth-prime-generator)

(defn- update-expected [expected]
  (if-let [error (:error expected)]
    {:error (str "^" error "$")}
    expected))

(defn update-test-case [test-case]
  (-> test-case
      (update :expected update-expected)))
