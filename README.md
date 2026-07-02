# kotoba-lang/physics-2d

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-physics-2d` Rust crate
(deleted in the kotoba-lang Rust removal) as part of the **clj-wgsl migration** (ADR-2607010930,
`com-junkawasaki/root`).

## Status

Restored. `src/physics_2d.cljc` is a zero-dep, portable (JVM Clojure + ClojureScript)
1:1 port of the deleted `kami-physics-2d/src/lib.rs` (209 lines): AABB + circle
colliders, brute-force O(n^2) broadphase/narrowphase collision detection, and
impulse-based collision resolution with positional correction over a simple 2D
rigid-body world. Mutating `World2D::step(&mut self, dt)` is modeled as a pure
`(world-step world dt) => world'` function; all other types (`Body2D`, `Collider2D`,
`Contact2D`) are plain CLJC maps.

All original Rust `#[test]`s are ported 1:1 to `test/physics_2d_test.cljc`
(plus a namespace-loads smoke test) — 2 tests / 2 assertions, 0 failures.

## Develop

```bash
clojure -M:test
```
